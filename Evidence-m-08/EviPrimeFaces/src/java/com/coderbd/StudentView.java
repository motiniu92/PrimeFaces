
package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentView {
    private List<Student> lists;

    public List<Student> getLists() {
        lists = new ArrayList<>();
        lists.add(new Student("A Motin", "motiniu92@gmail.com", "Male", "Java", "bangladesh"));
        lists.add(new Student("A Hosen", "motiniu92@gmail.com", "Male", "J2EE", "bangladesh"));
        lists.add(new Student("Sahin", "motiniu92@gmail.com", "Male", "Java", "Japan"));
        lists.add(new Student("Khaled", "motiniu92@gmail.com", "Male", "Swing", "India"));
        return lists;
    }

    public void setLists(List<Student> lists) {
        this.lists = lists;
    }
    
    
}
