package composite;

import java.util.ArrayList;
import java.util.List;

public class SalesDepartment implements Department {
    public int id;
    public String description;
    public List<Department> salesDepartaments;

    public SalesDepartment(int id, String description) {
        this.id = id;
        this.description = description;
        this.salesDepartaments = new ArrayList<>();
    }

    public void addSalesDepartment(Department d) {
        salesDepartaments.add(d);
    }

    public void removeSalesDepartment(Department d) {
        salesDepartaments.remove(d);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        salesDepartaments.forEach(Department::printDepartmentName);
    }
}
