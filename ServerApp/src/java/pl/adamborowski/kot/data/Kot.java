package pl.adamborowski.kot.data;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Kot {

    private String name;
    private ArrayList<Integer> numbers;
}
