package com.mountainwarehouse;

import java.util.HashMap;
import java.util.Map.Entry;

public class Challenge_3 {
    /// <summary>
    /// It has been a busy year at mountain warehouse, having made lots of sales.
    /// Management would like to know which branch made the most in revenue.
    /// For this challenge you will be given an array of sales broken down by Branch
    /// and Date.
    /// You will need to sum all branch sales across multiple days and identify
    /// which
    /// branch had the highest sales overall
    /// Assume that there is only one branch with the highest total
    /// We have provided some comments to help assist the steps we think you need to
    /// go through
    /// </summary>
    /// <param name="sales">The array of sales items</param>
    /// <returns>The branch with the best performing sales</returns>
    public static String CalculateBestBranch(SalesItem[] sales) {
        HashMap<String, Double> branchSales = new HashMap<String, Double>();

        // TODO: Add branch sales to Hash Map
        for (SalesItem item : sales){
            if (!branchSales.containsKey(item.Branch)){
                branchSales.put(item.Branch, item.TotalSales);
            }branchSales.put(item.Branch, branchSales.get(item.Branch) + item.TotalSales);
        }

        // TODO: Sort/get entry with highest sales value
        String bestBranch = "";
        double max = 0;

        for (Entry<String,Double> value: branchSales.entrySet()){
            if (value.getValue() > max){
                max = value.getValue();
                bestBranch = value.getKey();
            }
        }

        // TODO: Return branch

        return bestBranch;
    }
}
