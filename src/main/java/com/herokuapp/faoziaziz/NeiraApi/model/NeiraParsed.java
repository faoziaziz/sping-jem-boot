package com.herokuapp.faoziaziz.NeiraApi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NeiraParsed")
public class NeiraParsed{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idNUm")
    private Integer IdNum;

    @Column(name="DeviceId")
    private String DeviceId;

    @Column(name="FileStamp")
    private Date FileStamp;

    @Column(name="RefNeira")
    private Integer RefNeira;

    @Column(name="nomerTransaksi")
    private String nomerTransaksi;

    @Column(name="Tanggal")
    private String Tanggal;

    @Column(name="Jam")
    private String Jam;

    @Column(name="NomerHP")
    private String NomerHP;

    @Column(name="TotalTrans")
    private String TotalTrans;

    @Column(name="POS")
    private String POS;

    @Column(name="Toko")
    private String Toko;

    @Column(name="QRString")
    private String QRString;
    

    public Integer getidNUm(){
        return IdNum;
    }

    public String getDeviceId(){
        return DeviceId;
    }

    public Date getFileStamp(){
        return FileStamp;
    }

    public Integer getRefNeira(){
        return RefNeira;
    }
    
    public String getNomerTransaksi(){
        return nomerTransaksi;
    }
    public String getTanggal(){
        return Tanggal;
    }

    public String getJam(){
        return Jam;
    }
    public String getNomerHP(){
        return NomerHP;
    }
    public String getTotalTrans(){
        return TotalTrans;
    }
    public String getPOS(){
        return POS;
    }
    public String getToko(){
        return Toko;
    }

    public String getQRString(){
        return QRString;
    }

    
}