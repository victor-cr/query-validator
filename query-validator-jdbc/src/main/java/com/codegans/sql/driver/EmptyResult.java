package com.codegans.sql.driver;

import org.jooq.*;
import org.jooq.exception.*;
import org.w3c.dom.Document;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import java.io.OutputStream;
import java.io.Writer;
import java.sql.ResultSet;
import java.util.*;
import java.util.Comparator;

public class EmptyResult implements Result<Record> {
    @Override
    public RecordType<Record> recordType() {
        return null;
    }

    @Override
    public Row fieldsRow() {
        return null;
    }

    @Override
    public <T> Field<T> field(Field<T> field) {
        return null;
    }

    @Override
    public Field<?> field(String s) {
        return null;
    }

    @Override
    public <T> Field<T> field(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> Field<T> field(String s, DataType<T> dataType) {
        return null;
    }

    @Override
    public Field<?> field(Name name) {
        return null;
    }

    @Override
    public <T> Field<T> field(Name name, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> Field<T> field(Name name, DataType<T> dataType) {
        return null;
    }

    @Override
    public Field<?> field(int i) {
        return null;
    }

    @Override
    public <T> Field<T> field(int i, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> Field<T> field(int i, DataType<T> dataType) {
        return null;
    }

    @Override
    public Field<?>[] fields() {
        return new Field[0];
    }

    @Override
    public Field<?>[] fields(Field<?>... fields) {
        return new Field[0];
    }

    @Override
    public Field<?>[] fields(String... strings) {
        return new Field[0];
    }

    @Override
    public Field<?>[] fields(Name... names) {
        return new Field[0];
    }

    @Override
    public Field<?>[] fields(int... ints) {
        return new Field[0];
    }

    @Override
    public <T> T getValue(int i, Field<T> field) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public <T> T getValue(int i, Field<T> field, T t) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public Object getValue(int i, int i1) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public Object getValue(int i, int i1, Object o) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public Object getValue(int i, String s) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public Object getValue(int i, String s, Object o) throws IndexOutOfBoundsException, IllegalArgumentException {
        return null;
    }

    @Override
    public <T> List<T> getValues(Field<T> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> List<T> getValues(Field<?> field, Class<? extends T> aClass) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T, U> List<U> getValues(Field<T> field, Converter<? super T, ? extends U> converter) throws IllegalArgumentException {
        return null;
    }

    @Override
    public List<?> getValues(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> List<T> getValues(int i, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> List<U> getValues(int i, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public List<?> getValues(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> List<T> getValues(String s, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> List<U> getValues(String s, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public List<?> getValues(Name name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> List<T> getValues(Name name, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> List<U> getValues(Name name, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isNotEmpty() {
        return false;
    }

    @Override
    public List<Map<String, Object>> intoMaps() {
        return null;
    }

    @Override
    public <K> Map<K, Record> intoMap(Field<K> field) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, Record> intoMap(int i) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, Record> intoMap(String s) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, Record> intoMap(Name name) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public <K, V> Map<K, V> intoMap(Field<K> field, Field<V> field1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, ?> intoMap(int i, int i1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, ?> intoMap(String s, String s1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<?, ?> intoMap(Name name, Name name1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public <K, E> Map<K, E> intoMap(Field<K> field, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(int i, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(String s, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(Name name, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K, E> Map<K, E> intoMap(Field<K> field, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(int i, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(String s, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, E> intoMap(Name name, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(Field<?>[] fields) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(int[] ints) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(String[] strings) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(Name[] names) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(Field<?>[] fields, Field<?>[] fields1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(int[] ints, int[] ints1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(String[] strings, String[] strings1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public Map<Record, Record> intoMap(Name[] names, Name[] names1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(Field<?>[] fields, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(int[] ints, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(String[] strings, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(Name[] names, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(Field<?>[] fields, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(int[] ints, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(String[] strings, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E> Map<List<?>, E> intoMap(Name[] names, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K> Map<K, Record> intoMap(Class<? extends K> aClass) throws MappingException, InvalidResultException {
        return null;
    }

    @Override
    public <K, V> Map<K, V> intoMap(Class<? extends K> aClass, Class<? extends V> aClass1) throws MappingException, InvalidResultException {
        return null;
    }

    @Override
    public <K, V> Map<K, V> intoMap(Class<? extends K> aClass, RecordMapper<? super Record, V> recordMapper) throws InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K> Map<K, Record> intoMap(RecordMapper<? super Record, K> recordMapper) throws InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, V> intoMap(RecordMapper<? super Record, K> recordMapper, Class<V> aClass) throws InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, V> intoMap(RecordMapper<? super Record, K> recordMapper, RecordMapper<? super Record, V> recordMapper1) throws InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <S extends Record> Map<S, Record> intoMap(Table<S> table) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public <S extends Record, T extends Record> Map<S, T> intoMap(Table<S> table, Table<T> table1) throws IllegalArgumentException, InvalidResultException {
        return null;
    }

    @Override
    public <E, S extends Record> Map<S, E> intoMap(Table<S> table, Class<? extends E> aClass) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <E, S extends Record> Map<S, E> intoMap(Table<S> table, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, InvalidResultException, MappingException {
        return null;
    }

    @Override
    public <K> Map<K, Result<Record>> intoGroups(Field<K> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, Result<Record>> intoGroups(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, Result<Record>> intoGroups(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, Result<Record>> intoGroups(Name name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <K, V> Map<K, List<V>> intoGroups(Field<K> field, Field<V> field1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, List<?>> intoGroups(int i, int i1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, List<?>> intoGroups(String s, String s1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<?, List<?>> intoGroups(Name name, Name name1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <K, E> Map<K, List<E>> intoGroups(Field<K> field, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(int i, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(String s, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(Name name, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <K, E> Map<K, List<E>> intoGroups(Field<K> field, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(int i, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(String s, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<?, List<E>> intoGroups(Name name, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(Field<?>[] fields) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(int[] ints) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(String[] strings) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(Name[] names) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(Field<?>[] fields, Field<?>[] fields1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(int[] ints, int[] ints1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(String[] strings, String[] strings1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Map<Record, Result<Record>> intoGroups(Name[] names, Name[] names1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(Field<?>[] fields, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(int[] ints, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(String[] strings, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(Name[] names, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(Field<?>[] fields, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(int[] ints, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(String[] strings, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E> Map<Record, List<E>> intoGroups(Name[] names, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <K> Map<K, Result<Record>> intoGroups(Class<? extends K> aClass) throws MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, List<V>> intoGroups(Class<? extends K> aClass, Class<? extends V> aClass1) throws MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, List<V>> intoGroups(Class<? extends K> aClass, RecordMapper<? super Record, V> recordMapper) throws MappingException {
        return null;
    }

    @Override
    public <K> Map<K, Result<Record>> intoGroups(RecordMapper<? super Record, K> recordMapper) throws MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, List<V>> intoGroups(RecordMapper<? super Record, K> recordMapper, Class<V> aClass) throws MappingException {
        return null;
    }

    @Override
    public <K, V> Map<K, List<V>> intoGroups(RecordMapper<? super Record, K> recordMapper, RecordMapper<? super Record, V> recordMapper1) throws MappingException {
        return null;
    }

    @Override
    public <S extends Record> Map<S, Result<Record>> intoGroups(Table<S> table) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <S extends Record, T extends Record> Map<S, Result<T>> intoGroups(Table<S> table, Table<T> table1) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <E, S extends Record> Map<S, List<E>> intoGroups(Table<S> table, Class<? extends E> aClass) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public <E, S extends Record> Map<S, List<E>> intoGroups(Table<S> table, RecordMapper<? super Record, E> recordMapper) throws IllegalArgumentException, MappingException {
        return null;
    }

    @Override
    public Object[][] intoArray() {
        return new Object[0][];
    }

    @Override
    public Object[][] intoArrays() {
        return new Object[0][];
    }

    @Override
    public Object[] intoArray(int i) throws IllegalArgumentException {
        return new Object[0];
    }

    @Override
    public <T> T[] intoArray(int i, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> U[] intoArray(int i, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public Object[] intoArray(String s) throws IllegalArgumentException {
        return new Object[0];
    }

    @Override
    public <T> T[] intoArray(String s, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> U[] intoArray(String s, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public Object[] intoArray(Name name) throws IllegalArgumentException {
        return new Object[0];
    }

    @Override
    public <T> T[] intoArray(Name name, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> U[] intoArray(Name name, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <T> T[] intoArray(Field<T> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> T[] intoArray(Field<?> field, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <T, U> U[] intoArray(Field<T> field, Converter<? super T, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <E> Set<E> intoSet(RecordMapper<? super Record, E> recordMapper) {
        return null;
    }

    @Override
    public Set<?> intoSet(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Set<T> intoSet(int i, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> Set<U> intoSet(int i, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public Set<?> intoSet(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Set<T> intoSet(String s, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> Set<U> intoSet(String s, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public Set<?> intoSet(Name name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Set<T> intoSet(Name name, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <U> Set<U> intoSet(Name name, Converter<?, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <T> Set<T> intoSet(Field<T> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Set<T> intoSet(Field<?> field, Class<? extends T> aClass) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public <T, U> Set<U> intoSet(Field<T> field, Converter<? super T, ? extends U> converter) throws IllegalArgumentException, DataTypeException {
        return null;
    }

    @Override
    public Result<Record> into(Field<?>... fields) {
        return null;
    }

    @Override
    public <T1> Result<Record1<T1>> into(Field<T1> field) {
        return null;
    }

    @Override
    public <T1, T2> Result<Record2<T1, T2>> into(Field<T1> field, Field<T2> field1) {
        return null;
    }

    @Override
    public <T1, T2, T3> Result<Record3<T1, T2, T3>> into(Field<T1> field, Field<T2> field1, Field<T3> field2) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4> Result<Record4<T1, T2, T3, T4>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5> Result<Record5<T1, T2, T3, T4, T5>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6> Result<Record6<T1, T2, T3, T4, T5, T6>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7> Result<Record7<T1, T2, T3, T4, T5, T6, T7>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8> Result<Record8<T1, T2, T3, T4, T5, T6, T7, T8>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9> Result<Record9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Result<Record10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Result<Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Result<Record12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Result<Record13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Result<Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Result<Record15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Result<Record16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Result<Record17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Result<Record18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16, Field<T18> field17) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Result<Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16, Field<T18> field17, Field<T19> field18) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Result<Record20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16, Field<T18> field17, Field<T19> field18, Field<T20> field19) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Result<Record21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16, Field<T18> field17, Field<T19> field18, Field<T20> field19, Field<T21> field20) {
        return null;
    }

    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Result<Record22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> into(Field<T1> field, Field<T2> field1, Field<T3> field2, Field<T4> field3, Field<T5> field4, Field<T6> field5, Field<T7> field6, Field<T8> field7, Field<T9> field8, Field<T10> field9, Field<T11> field10, Field<T12> field11, Field<T13> field12, Field<T14> field13, Field<T15> field14, Field<T16> field15, Field<T17> field16, Field<T18> field17, Field<T19> field18, Field<T20> field19, Field<T21> field20, Field<T22> field21) {
        return null;
    }

    @Override
    public <E> List<E> into(Class<? extends E> aClass) throws MappingException {
        return null;
    }

    @Override
    public <Z extends Record> Result<Z> into(Table<Z> table) throws MappingException {
        return null;
    }

    @Override
    public <H extends RecordHandler<? super Record>> H into(H h) {
        return null;
    }

    @Override
    public ResultSet intoResultSet() {
        return null;
    }

    @Override
    public <E> List<E> map(RecordMapper<? super Record, E> recordMapper) {
        return null;
    }

    @Override
    public <T extends Comparable<? super T>> Result<Record> sortAsc(Field<T> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T extends Comparable<? super T>> Result<Record> sortDesc(Field<T> field) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(Name name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(Name name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Result<Record> sortAsc(Field<T> field, Comparator<? super T> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T> Result<Record> sortDesc(Field<T> field, Comparator<? super T> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(int i, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(int i, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(String s, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(String s, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(Name name, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortDesc(Name name, Comparator<?> comparator) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Result<Record> sortAsc(Comparator<? super Record> comparator) {
        return null;
    }

    @Override
    public Result<Record> sortDesc(Comparator<? super Record> comparator) {
        return null;
    }

    @Override
    public Result<Record> intern(Field<?>... fields) {
        return null;
    }

    @Override
    public Result<Record> intern(int... ints) {
        return null;
    }

    @Override
    public Result<Record> intern(String... strings) {
        return null;
    }

    @Override
    public Result<Record> intern(Name... names) {
        return null;
    }

    @Override
    public <O extends UpdatableRecord<O>> Result<O> fetchParents(ForeignKey<Record, O> foreignKey) throws DataAccessException {
        return null;
    }

    @Override
    public <O extends TableRecord<O>> Result<O> fetchChildren(ForeignKey<O, Record> foreignKey) throws DataAccessException {
        return null;
    }

    @Override
    public void attach(Configuration configuration) {

    }

    @Override
    public void detach() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Record> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Record record) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Record> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Record> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public Record get(int index) {
        return null;
    }

    @Override
    public Record set(int index, Record element) {
        return null;
    }

    @Override
    public void add(int index, Record element) {

    }

    @Override
    public Record remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Record> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Record> listIterator(int index) {
        return null;
    }

    @Override
    public List<Record> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Configuration configuration() {
        return null;
    }

    @Override
    public String format() {
        return null;
    }

    @Override
    public String format(int i) {
        return null;
    }

    @Override
    public String format(TXTFormat txtFormat) {
        return null;
    }

    @Override
    public String formatHTML() {
        return null;
    }

    @Override
    public String formatCSV() {
        return null;
    }

    @Override
    public String formatCSV(char c) {
        return null;
    }

    @Override
    public String formatCSV(char c, String s) {
        return null;
    }

    @Override
    public String formatCSV(boolean b) {
        return null;
    }

    @Override
    public String formatCSV(boolean b, char c) {
        return null;
    }

    @Override
    public String formatCSV(boolean b, char c, String s) {
        return null;
    }

    @Override
    public String formatCSV(CSVFormat csvFormat) {
        return null;
    }

    @Override
    public String formatJSON() {
        return null;
    }

    @Override
    public String formatJSON(JSONFormat jsonFormat) {
        return null;
    }

    @Override
    public String formatXML() {
        return null;
    }

    @Override
    public String formatXML(XMLFormat xmlFormat) {
        return null;
    }

    @Override
    public String formatChart() {
        return null;
    }

    @Override
    public String formatChart(ChartFormat chartFormat) {
        return null;
    }

    @Override
    public String formatInsert() {
        return null;
    }

    @Override
    public String formatInsert(Table<?> table, Field<?>... fields) {
        return null;
    }

    @Override
    public void format(OutputStream outputStream) throws IOException {

    }

    @Override
    public void format(OutputStream outputStream, int i) throws IOException {

    }

    @Override
    public void format(OutputStream outputStream, TXTFormat txtFormat) throws IOException {

    }

    @Override
    public void formatHTML(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, char c) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, char c, String s) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, boolean b) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, boolean b, char c) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, boolean b, char c, String s) throws IOException {

    }

    @Override
    public void formatCSV(OutputStream outputStream, CSVFormat csvFormat) throws IOException {

    }

    @Override
    public void formatJSON(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatJSON(OutputStream outputStream, JSONFormat jsonFormat) throws IOException {

    }

    @Override
    public void formatXML(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatXML(OutputStream outputStream, XMLFormat xmlFormat) throws IOException {

    }

    @Override
    public void formatChart(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatChart(OutputStream outputStream, ChartFormat chartFormat) throws IOException {

    }

    @Override
    public void formatInsert(OutputStream outputStream) throws IOException {

    }

    @Override
    public void formatInsert(OutputStream outputStream, Table<?> table, Field<?>... fields) throws IOException {

    }

    @Override
    public void format(Writer writer) throws IOException {

    }

    @Override
    public void format(Writer writer, int i) throws IOException {

    }

    @Override
    public void format(Writer writer, TXTFormat txtFormat) throws IOException {

    }

    @Override
    public void formatHTML(Writer writer) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, char c) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, char c, String s) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, boolean b) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, boolean b, char c) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, boolean b, char c, String s) throws IOException {

    }

    @Override
    public void formatCSV(Writer writer, CSVFormat csvFormat) throws IOException {

    }

    @Override
    public void formatJSON(Writer writer) throws IOException {

    }

    @Override
    public void formatJSON(Writer writer, JSONFormat jsonFormat) throws IOException {

    }

    @Override
    public void formatXML(Writer writer) throws IOException {

    }

    @Override
    public void formatXML(Writer writer, XMLFormat xmlFormat) throws IOException {

    }

    @Override
    public void formatChart(Writer writer) throws IOException {

    }

    @Override
    public void formatChart(Writer writer, ChartFormat chartFormat) throws IOException {

    }

    @Override
    public void formatInsert(Writer writer) throws IOException {

    }

    @Override
    public void formatInsert(Writer writer, Table<?> table, Field<?>... fields) throws IOException {

    }

    @Override
    public Document intoXML() {
        return null;
    }

    @Override
    public Document intoXML(XMLFormat xmlFormat) {
        return null;
    }

    @Override
    public <H extends ContentHandler> H intoXML(H h) throws SAXException {
        return null;
    }

    @Override
    public <H extends ContentHandler> H intoXML(H h, XMLFormat xmlFormat) throws SAXException {
        return null;
    }
}
