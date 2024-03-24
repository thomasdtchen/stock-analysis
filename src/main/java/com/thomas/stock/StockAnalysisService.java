package com.thomas.stock;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class StockAnalysisService {

    public List<BestStock> getBestStocks(BestStocksRequest request) {
        List<BestStock> bestStocks = new ArrayList<>();
        BestStock stock1 = new BestStock("000001.XSHE", "Increased most in past 7 days");
        BestStock stock2 = new BestStock("000002.XSHE", "Decreased most in past 7 days");
        BestStock stock3 = new BestStock("000003.XSHE", "Highest trading volume");
        BestStock stock4 = new BestStock("000004.XSHE", "Lowest trading volume");
        BestStock stock5 = new BestStock("000005.XSHE", "Highest market capitalization");
        BestStock stock6 = new BestStock("000006.XSHE", "Lowest market capitalization");
        BestStock stock7 = new BestStock("000007.XSHE", "Highest dividend yield");
        BestStock stock8 = new BestStock("000008.XSHE", "Lowest dividend yield");
        BestStock stock9 = new BestStock("000009.XSHE", "Most volatile");
        BestStock stock10 = new BestStock("000010.XSHE", "Least volatile");
        
        bestStocks.add(stock1);
        bestStocks.add(stock2);
        bestStocks.add(stock3);
        bestStocks.add(stock4);
        bestStocks.add(stock5);
        bestStocks.add(stock6);
        bestStocks.add(stock7);
        bestStocks.add(stock8);
        bestStocks.add(stock9);
        bestStocks.add(stock10);
        
        return bestStocks;
    }

}
    
    

