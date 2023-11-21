package src.main.strategy;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Item {
    @Getter
    private Long price;
    @Getter
    private String code;
}
