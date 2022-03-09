package org.zerock.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Store {
    Long sno;
    String name;
    double lat, lng;
}
