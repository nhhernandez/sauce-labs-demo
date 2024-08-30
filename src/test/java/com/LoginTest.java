package com;

import com.nhhernandez.saucedemo.pages.LoginPage;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        // Crear una instancia de la página de inicio de sesión
        LoginPage loginPage = new LoginPage(driver);

        // Navegar a la página de inicio de sesión
        loginPage.navigateTo("https://www.saucedemo.com/");

        // Realizar acciones en la página de inicio de sesión
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        // Verificar que el inicio de sesión fue exitoso, por ejemplo, revisando la URL
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}