package DesignPattern.b11组合模式;

/**
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * <p>
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 * <p>
 * 我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。
 */
public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("石昊", "总经理", 30000);

        Employee headSales = new Employee("清漪", "销售主管", 20000);
        Employee headclerk = new Employee("云曦", "组长", 20000);

        Employee clerk1 = new Employee("芙蕖", "员工", 10000);
        Employee clerk2 = new Employee("曼珠沙华", "员工", 10000);

        Employee sales1 = new Employee("凤舞", "销售", 10000);
        Employee sales2 = new Employee("月婵", "销售", 10000);

        CEO.add(headSales);
        CEO.add(headclerk);

        headSales.add(sales1);
        headSales.add(sales2);

        headclerk.add(clerk1);
        headclerk.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
