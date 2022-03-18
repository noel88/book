package com.example.houseutils.controller;


import com.example.houseutils.constants.ActionType;
import com.example.houseutils.policy.BrokeragePolicy;
import com.example.houseutils.policy.BrokeragePolicyFactory;
import com.example.houseutils.policy.PurchaseBrokeragePolicy;
import com.example.houseutils.policy.RentBrokeragePolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        //TODO: 중개수수료 계산 로직.

        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);

//        if (actionType == ActionType.PURCHASE) {
//            PurchaseBrokeragePolicy policy = new PurchaseBrokeragePolicy();
//            return policy.calculate(price);
//        }
//
//        if (actionType == ActionType.RENT) {
//            RentBrokeragePolicy policy = new RentBrokeragePolicy();
//            return policy.calculate(price);
//        }

        return policy.calculate(price);
    }
}
