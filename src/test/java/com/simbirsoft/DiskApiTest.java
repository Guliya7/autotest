package com.simbirsoft;

import com.simbirsoft.api.disk.DiskApi;
import com.simbirsoft.api.models.MetainformationAboutDiskUser;
import com.simbirsoft.api.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static org.testng.Assert.assertEquals;

public class DiskApiTest {
    @Test
    @Description("Some detailed test description")
    public void getMetainformationAboutDiskUserTest() {
        MetainformationAboutDiskUser metainformationAboutDiskUser = new DiskApi()
                .GetAllMetainformationAboutDiskUser();
        assertEquals(metainformationAboutDiskUser.getUser().getCountry(), "ru");
    }
}
