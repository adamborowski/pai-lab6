package pl.adamborowski.kot.data;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.adamborowski.kot.dao.AbstractObject;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cat extends AbstractObject{

    private String name;
    private Integer age;
}
