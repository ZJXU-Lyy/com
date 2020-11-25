package org.model;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: ComplexAssembly
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 16:49
 * @Version: v1.0
 */
public class ComplexAssembly {
    private Long id;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    private String[] array;
    private Properties properties;

    public ComplexAssembly(Long id, List<String> list, Map<String, String> map, Set<String> set, String[] array, Properties properties) {
        this.id = id;
        this.list = list;
        this.map = map;
        this.set = set;
        this.array = array;
        this.properties = properties;
    }

    public ComplexAssembly() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
