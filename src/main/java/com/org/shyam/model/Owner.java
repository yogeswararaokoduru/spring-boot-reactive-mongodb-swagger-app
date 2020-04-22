package com.org.shyam.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "owner")
public class Owner implements Serializable {

    @Id
    private String name;
    private String owner;
    private Number value;
    private String makeModel;


}
