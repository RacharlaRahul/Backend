package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;

@Data
@Entity
@Table
public class Accounts {
private int customer_id;
@TableGenerator(name = "Address_Gen", initialValue = 10000, allocationSize = 100)
@Id
@GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen")
private int account_id;

}
