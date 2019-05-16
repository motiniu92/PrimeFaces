
package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class BusController {
    private List<Bus>bustList;
   private List<Bus> selectedBus;

    public List<Bus> getSelectedBus() {
        return selectedBus;
    }

    public void setSelectedBus(List<Bus> selectedBus) {
        this.selectedBus = selectedBus;
    }
   
   

    public List<Bus> getBustList() {
        bustList = new ArrayList<>();
        bustList.add(new Bus("100", "1980", "Toyota", "Red"));
        bustList.add(new Bus("101", "1940", "Nano", "Blue"));
        bustList.add(new Bus("102", "1957", "Jafaro", "Green"));
        bustList.add(new Bus("103", "1986", "Blaze", "Yellow"));
        bustList.add(new Bus("104", "1881", "KaLopa", "Orange"));
        bustList.add(new Bus("105", "2015", "Festtow", "Pinck"));
        bustList.add(new Bus("106", "1782", "Ullah", "Red"));
        bustList.add(new Bus("107", "1782", "BMWX", "magenta"));
        return bustList;
    }

    public void setBustList(List<Bus> bustList) {
        this.bustList = bustList;
    }
    
    
}
