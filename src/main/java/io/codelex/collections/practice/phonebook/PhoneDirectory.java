package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private Map<String, PhoneEntry> entryData;

    public PhoneDirectory() {
        entryData = new TreeMap<>();
    }

    public String getNumber(String name) {
        PhoneEntry entry = entryData.get(name);
        return (entry != null) ? entry.number : null;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        PhoneEntry entry = entryData.get(name);
        if (entry == null) {
            entry = new PhoneEntry();
            entry.name = name;
            entryData.put(name, entry);
        }
        entry.number = number;
    }

}
