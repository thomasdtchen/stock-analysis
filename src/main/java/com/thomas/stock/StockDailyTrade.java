package com.thomas.stock;
import lombok.Data;
import java.math.BigDecimal; // Add this import statement
@Data
public class StockDailyTrade {
    private String time;
    private String code;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private Long volume;
    private BigDecimal money;

    // Rest of the class code...
}
