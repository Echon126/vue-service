package com.example.test.data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {

    public static List<TableData> tableData = Arrays.asList(
            new TableData("zhangsan", 10, "beijing", new Date()),
            new TableData("lisi", 20, "xian", new Date()),
            new TableData("zhaoliu", 30, "shanghai", new Date()),
            new TableData("Mikon",19,"newyouke",new Date()));

    /**
     * 根据年龄查询
     * @param age
     * @return
     */
    public static List<TableData> queryTableData(int age) {
        List<TableData> tableDataList = Repository.tableData;
        return tableDataList.stream().filter(t -> t.getAge() == age).collect(Collectors.toList());
    }

}
