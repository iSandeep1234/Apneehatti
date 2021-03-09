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
@Table(name = "CLIENT_CATEGORY", schema = "LF")
public class ClientCategory extends PersistedObject {

    private String categoryName;

    private String description;
}
