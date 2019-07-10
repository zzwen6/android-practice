package top.hting.fragment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor(suppressConstructorProperties = true)
@NoArgsConstructor
public class News implements Serializable {


    private String title;

    private String content;

}
