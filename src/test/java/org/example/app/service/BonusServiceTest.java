package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    public void test_Expected_Calculation_Result() {
        BonusService bonusService = new BonusService();
        double sales = 100.0;
        assertEquals("10,00", bonusService.getRes(sales));
    }

    @Test
    public void test_Unexpected_Calculation_Result() {
        BonusService bonusService = new BonusService();
        double sales = -1000.0;
        assertEquals("Incorrect value!", bonusService.getRes(sales));
    }

}