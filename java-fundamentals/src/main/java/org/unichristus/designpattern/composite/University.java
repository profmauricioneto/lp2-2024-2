package org.unichristus.designpattern.composite;

public class University {
    public static void main(String[] args) {
        SalesDepartment sales = new SalesDepartment(1, "Equipe de Vendas!");

        FinancialDepartment financial = new FinancialDepartment(2, "Equipe Financeira");
        HumanResourceDepartment rh = new HumanResourceDepartment(4, "Equipe RH");
        HeadDepartment allDepartment = new HeadDepartment(3, "Chefia");
        FinancialDepartment financialOfSales = new FinancialDepartment(5, "Finanças de Vendas");
        sales.addSalesDepartment(financialOfSales);

        allDepartment.addDepartment(sales);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(financial);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(rh);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");

    }
}
