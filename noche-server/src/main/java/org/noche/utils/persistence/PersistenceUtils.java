package org.noche.utils.persistence;

import org.springframework.util.Assert;

import java.util.*;

/**
 * Created by Timi on 4/7/2017.
 */
public class PersistenceUtils {

    /* --- Constructor --- */

    // private c'tor
    private PersistenceUtils() {
    }

    /* --- Static methods --- */

    public static <K,V> Map<K,V> resultsAsMap(List results, Class<K> keyClazz, Class<V> valueClazz) {
        Assert.notNull(keyClazz);
        Assert.notNull(valueClazz);

        Map<K,V> map = new HashMap<>();
        for (Object result : results) {
            Object[] items = (Object[]) result;
            map.put(keyClazz.cast(items[0]), valueClazz.cast(items[1]));
        }
        return map;
    }

    public static <K,V> Map<K, Collection<V>> groupResults(List results, Class<K> keyClazz, Class<V> valueClazz) {
        Assert.notNull(keyClazz);
        Assert.notNull(valueClazz);

        Map<K, Collection<V>> groupedResults = new HashMap<>();
        for (Object result : results) {
            Object[] items = (Object[]) result;
            K key = keyClazz.cast(items[0]);
            V value = valueClazz.cast(items[1]);
            if (value == null) {
                continue;
            }

            Collection<V> values = groupedResults.get(key);
            if (values == null) {
                values = new HashSet<>();
                groupedResults.put(key, values);
            }
            values.add(value);
        }
        return groupedResults;
    }
}
