package com.thetestingacademy.tests.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationsample {
    //Create A booking,Create aToken
    //get booking
    //Update the booking
    //Delete the booking
    @Test(groups ="integration" ,priority = 1)
    @Owner("Promode")
    @Description("TC#!-Step1.Verify that booking can be created")
    public void testCreateBooking()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "integration" , priority = 2)
    @Owner("Promode")
    @Description("TC#!-Step2.Verify that booking by ID")
    public void testVerifyBooking()
    {
        Assert.assertTrue(true);
    }
    @Test(groups = "integration" , priority = 3)
    @Owner("Promode")
    @Description("TC#!-Step3.Verify updated Booking by ID")
    public void testUpdatedBookingId()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "integration" , priority = 4)
    @Owner("Promode")
    @Description("TC#!-Step4. Delete the booking Id")
    public void testDeleteBookingById()
    {
        Assert.assertTrue(true);
    }
}
