package com.thomas.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api/stock")
public class StockAnalysisController {
    @Autowired
    private StockAnalysisService stockAnalysisService;

    @PostMapping("/best/stocks")
    public ResponseEntity<List<BestStock>> getBestStocks(@RequestBody BestStocksRequest bestStocksRequest) {
        List<BestStock> bestStocks = stockAnalysisService.getBestStocks(bestStocksRequest);
        return ResponseEntity.ok(bestStocks);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Stock Analysis!";
    }
}
