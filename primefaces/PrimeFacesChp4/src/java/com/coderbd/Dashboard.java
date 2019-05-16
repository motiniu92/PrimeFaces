
package com.coderbd;


public class Dashboard {
     private String dashboardTitle="Admin Dahsboard";
    private  double todaySales=50000.0;
    private  double weeklyAvgSales=70000.0;
    private  double  lastMonthSales= 1800000.0;
    private  String mostPurchaseCustomer="Mr.AAAAA";
    private int noOfProductsInShop=380;

    public String getDashboardTitle() {
        return dashboardTitle;
    }

    public void setDashboardTitle(String dashboardTitle) {
        this.dashboardTitle = dashboardTitle;
    }

    public double getTodaySales() {
        return todaySales;
    }

    public void setTodaySales(double todaySales) {
        this.todaySales = todaySales;
    }

    public double getWeeklyAvgSales() {
        return weeklyAvgSales;
    }

    public void setWeeklyAvgSales(double weeklyAvgSales) {
        this.weeklyAvgSales = weeklyAvgSales;
    }

    public double getLastMonthSales() {
        return lastMonthSales;
    }

    public void setLastMonthSales(double lastMonthSales) {
        this.lastMonthSales = lastMonthSales;
    }

    public String getMostPurchaseCustomer() {
        return mostPurchaseCustomer;
    }

    public void setMostPurchaseCustomer(String mostPurchaseCustomer) {
        this.mostPurchaseCustomer = mostPurchaseCustomer;
    }

    public int getNoOfProductsInShop() {
        return noOfProductsInShop;
    }

    public void setNoOfProductsInShop(int noOfProductsInShop) {
        this.noOfProductsInShop = noOfProductsInShop;
    }

    public Dashboard() {
    }
    
    

}
