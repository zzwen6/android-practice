package top.hting.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor(suppressConstructorProperties = true)
@NoArgsConstructor
public class Msg implements Serializable {

    private String content;
    private int type;

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;



}
