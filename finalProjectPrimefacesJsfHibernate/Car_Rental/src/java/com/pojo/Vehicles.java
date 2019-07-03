package com.pojo;
// Generated Jul 27, 2018 11:38:02 PM by Hibernate Tools 4.3.1


import com.util.HibernateUtil;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.model.UploadedFile;
import org.apache.commons.io.FileUtils;

/**
 * Vehicles generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Vehicles implements java.io.Serializable {

    private Integer VId;
    private String VName;
    private int seatNo;
    private String driverName;
    private String DPhone;
    private String imgUrl;
    private String location;
    private double rentCost;
    private String status= "Available";
    UploadedFile file;
    private SelectItem[] times = new SelectItem[]{
        new SelectItem("Anytime", "Anytime"),
        new SelectItem("Morning", "Morning"),
        new SelectItem("Afternoon", "Afternoon"),
        new SelectItem("Evening", "Evening")};

    public Vehicles() {
    }

    public Vehicles(String VName, int seatNo, String driverName, String DPhone, String imgUrl, String location, double rentCost, String status) {
        this.VName = VName;
        this.seatNo = seatNo;
        this.driverName = driverName;
        this.DPhone = DPhone;
        this.imgUrl = imgUrl;
        this.location = location;
        this.rentCost = rentCost;
        this.status = status;
    }
    
    public boolean insert() {
        imgUpload();
        Vehicles vehicle = new Vehicles(getVName(), getSeatNo(), getDriverName(), getDPhone(),getImgUrl(),
                getLocation(), getRentCost(), getStatus());
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();
        return true;
    }
    
    public void imgUpload() {

        if (file != null) {
            try {
                FacesContext context = FacesContext.getCurrentInstance();
                ServletContext serveletecontext = (ServletContext) context.getExternalContext().getContext();
                String dbpsth = serveletecontext.getRealPath("/");
                String webcut = dbpsth.substring(0, dbpsth.lastIndexOf("\\"));
                String buildcut = webcut.substring(0, webcut.lastIndexOf("\\"));
                String mainURLPath = buildcut.substring(0, buildcut.lastIndexOf("\\"));

                InputStream inputstream = file.getInputstream();
                String path = mainURLPath + "\\web\\resources\\images\\" + file.getFileName();
                File destFile = new File(path);
                if (!destFile.exists()) {
                    FileUtils.copyInputStreamToFile(inputstream, destFile);
                   
                }
                 setImgUrl(file.getFileName().toString());
            } catch (Exception e) {
            }
        }
    }
    
    
    
     public List<Vehicles> vehicleList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "select al from Vehicles al where location= :location and seatNo= :seat_No ";
        Query quary = session.createQuery(sql);
        quary.setString("location", location);
        quary.setInteger("seat_No", seatNo);
        List<Vehicles> vList = quary.list();
        vList.toString();
        session.close();
        return vList;
    }
     
      public boolean search() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = "select al from Vehicles al where location= :location and seatNo= :seat_No ";
        Query quary = session.createQuery(sql);
        quary.setString("location", location);
        quary.setInteger("seat_No", seatNo);
        List a = quary.list();
        System.out.println(a);
        int b = a.size();
        if (b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
      
    public Integer getVId() {
        return this.VId;
    }

    public void setVId(Integer VId) {
        this.VId = VId;
    }

    public String getVName() {
        return this.VName;
    }

    public void setVName(String VName) {
        this.VName = VName;
    }

    public int getSeatNo() {
        return this.seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDPhone() {
        return this.DPhone;
    }

    public void setDPhone(String DPhone) {
        this.DPhone = DPhone;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRentCost() {
        return this.rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SelectItem[] getTimes() {
        return times;
    }

    public void setTimes(SelectItem[] times) {
        this.times = times;
    }
    
}
