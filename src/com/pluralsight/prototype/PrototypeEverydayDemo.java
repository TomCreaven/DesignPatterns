package com.pluralsight.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {

    public static void main(String[] args) {
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        System.out.println(firstStatement);
        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        System.out.println(secondStatement);

        // so even though this is a cloned object and the object references for the statements are separate, the paramaters are the same, the record object is the same,
        // it's just returning the references to the same objects.
        // This is an example of a shallow copy. A deep copy would return a new array list (with the same fields) and a new record object etc.
        // This might be considered dangerous, as changes to that array list for example would be reflected in the original object.
    }
}
