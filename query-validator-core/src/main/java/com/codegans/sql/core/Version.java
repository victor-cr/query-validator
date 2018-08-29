package com.codegans.sql.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public final class Version {
    private static final Data CURRENT_DATA;
    private static final Data DEFAULT_DATA = new Data(
            "Fake Database",
            "1.0",
            "Fake Driver",
            1,
            0
    );

    static {
        Logger log = LoggerFactory.getLogger(Version.class);
        Data data = DEFAULT_DATA;
        Class<Version> me = Version.class;

        try {
            Enumeration<URL> manifests = me.getClassLoader().getResources("META-INF/MANIFEST.MF");

            while (manifests.hasMoreElements()) {
                try (InputStream in = manifests.nextElement().openStream()) {
                    Manifest manifest = new Manifest(in);

                    Attributes attributes = manifest.getMainAttributes();

                    if (me.getName().equals(attributes.getValue(Attributes.Name.MAIN_CLASS))) {
                        log.debug("Found a proper MANIFEST.MF: {}", attributes);

                        data = new Data(
                                attributes.getValue(Attributes.Name.IMPLEMENTATION_VENDOR),
                                attributes.getValue(Attributes.Name.IMPLEMENTATION_VERSION),
                                attributes.getValue(Attributes.Name.IMPLEMENTATION_TITLE),
                                1,
                                0
                        );
                        break;
                    }
                }
            }
        } catch (IOException e) {
            log.debug(e.getMessage(), e);
            log.warn("Cannot find proper MANIFEST.MF, using default settings");
        }

        CURRENT_DATA = data;
    }

    public static String getDatabaseName() {
        return CURRENT_DATA.databaseName;
    }

    public static String getDatabaseVersion() {
        return CURRENT_DATA.databaseVersion;
    }

    public static String getDriverName() {
        return CURRENT_DATA.driverName;
    }

    public static String getDriverVersion() {
        return CURRENT_DATA.driverMajorVersion + "." + CURRENT_DATA.driverMinorVersion;
    }

    public static int getDriverMajorVersion() {
        return CURRENT_DATA.driverMajorVersion;
    }

    public static int getDriverMinorVersion() {
        return CURRENT_DATA.driverMinorVersion;
    }

    public static void main(String[] args) {
        System.out.println(CURRENT_DATA);
    }

    private static final class Data {
        private final String databaseName;
        private final String databaseVersion;
        private final String driverName;
        private final int driverMajorVersion;
        private final int driverMinorVersion;

        private Data(String databaseName, String databaseVersion, String driverName, int driverMajorVersion, int driverMinorVersion) {
            this.databaseName = databaseName;
            this.databaseVersion = databaseVersion;
            this.driverName = driverName;
            this.driverMajorVersion = driverMajorVersion;
            this.driverMinorVersion = driverMinorVersion;
        }

        @Override
        public String toString() {
            return databaseName + " v" + databaseVersion;
        }
    }
}
