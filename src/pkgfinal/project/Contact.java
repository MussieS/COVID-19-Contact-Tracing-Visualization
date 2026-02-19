
package pkgfinal.project;


public class Contact {
    private User reportingUser;
    private User contactUser;
    private String startTime;
    private String endTime;
    

    public Contact(User reportingUser, User contactUser, String startTime, String endTime ) {
        this.reportingUser = reportingUser;
        this.contactUser = contactUser;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public User getReportingUser() 
    {
        return reportingUser;
    }

    public User getContactUser() 
    {
        return contactUser;
    }

    public String getStartTime() 
    {
        return startTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }

    public void setReportingUser(User reportingUser) 
    {
        this.reportingUser = reportingUser;
    }

    public void setContactUser(User contactUser) 
    {
        this.contactUser = contactUser;
    }

    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }
    
    @Override
    public String toString() {
        return  "Reporting User" + reportingUser.getUserId() + "\nContact User: " + contactUser.getUserId() + "\nStart Time: " + startTime + "\nEnd Time: " + endTime ;
    }
    
}
