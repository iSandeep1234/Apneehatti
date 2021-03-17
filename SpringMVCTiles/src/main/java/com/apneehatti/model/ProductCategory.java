package com.apneehatti.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@ToString
@Table(name = "PRODUCT_CATEGORY", schema = "LF")
public class ProductCategory extends PersistedObject {

    private String productName;
    private String description;
}
