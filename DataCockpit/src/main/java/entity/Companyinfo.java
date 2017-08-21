package entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Companyinfo {
    
    private Integer id;
    @NotNull
    private String corpname;
    @NotNull
    @Pattern(regexp="^(13|15|17|18)[0-9]{9}$",message="请输入有效手机号")
    private String phone;
    @NotNull
    private String name;
    @NotNull
    private String job;
    @NotNull
    @Pattern(regexp="[a-zA-Z0-9]{8,12}",message="密码必须为8-12位数字与字母组合")
    private String password;
    @NotNull
    private String email;
    @NotNull
    private Integer state;
    @NotNull
    private Integer approval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getApproval() {
        return approval;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }
}