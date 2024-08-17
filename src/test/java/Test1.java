import example.ConfProperties;
import example.PaymentBlock;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static PaymentBlock paymentBlock;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        paymentBlock = new PaymentBlock (driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("page"));
        paymentBlock.clickCooky();}

    //Услуги связи
    //Поле номер телефона
    @Test
    public void checkingPlaceHolderPhoneTest() {
        String actualPlaceholderPhone = paymentBlock.checkPlaceholderPhone();
        Assert.assertEquals(ConfProperties.getProperty("phonePlaceholder"),actualPlaceholderPhone);
    }

    //Поле сумма
    @Test
    public void checkingPlaceHolderSumTest() {
        String actualPlaceholderSum = paymentBlock.checkPlaceholderSum();
        Assert.assertEquals(ConfProperties.getProperty("sumPlaceholder"), actualPlaceholderSum);
    }

    //Поле e-mail
    @Test
    public void checkingPlaceHolderEmailTest() {
        String actualPlaceholderEmail = paymentBlock.checkPlaceholderEmail();
        Assert.assertEquals(ConfProperties.getProperty("emailPlaceholder"), actualPlaceholderEmail);
    }

    //Домашний интернет
    //Поле номер абонента
    @Test
    public void checkingPlaceHolderNumberNumber() {
        String actualPlaceholderNumberSubscriber = paymentBlock.checkPlaceholderNumberSubscriber();
        Assert.assertEquals(ConfProperties.getProperty("subscriberNumberPlaceholder"),actualPlaceholderNumberSubscriber);
    }

    //Поле сумма
    @Test
    public void checkingPlaceHolderSumHomeInternet() {
        String actualPlaceholderSumHomeInternet = paymentBlock.checkPlaceholderSumHomeInternet();
        Assert.assertEquals(ConfProperties.getProperty("sumPlaceholder"),actualPlaceholderSumHomeInternet);
    }

    //Поле e-mail
    @Test
    public void checkingPlaceHolderEmailHomeInternet() {
        String actualPlaceholderEmailHomeInternet = paymentBlock.checkPlaceholderEmailHomeInternet();
        Assert.assertEquals(ConfProperties.getProperty("emailPlaceholder"),actualPlaceholderEmailHomeInternet);
    }

    //Рассрочка
    //Поле номер аккаунта
    @Test
    public void checkingPlaceHolderAccountNumber() {
        String actualPlaceholderAccountNumber = paymentBlock.checkPlaceholderNumberAccount();
        Assert.assertEquals(ConfProperties.getProperty("accountNumberPlaceholder"),actualPlaceholderAccountNumber);
    }

    //Поле сумма
    @Test
    public void checkingPlaceHolderSumInstalment() {
        String actualPlaceholderSumInstalment = paymentBlock.checkPlaceholderSumInstalment();
        Assert.assertEquals(ConfProperties.getProperty("sumPlaceholder"),actualPlaceholderSumInstalment);
    }

    //Поле e-mail
    @Test
    public void checkingPlaceHolderEmailInstalment() {
        String actualPlaceholderEmailInstalment = paymentBlock.checkPlaceholderEmailInstalment();
        Assert.assertEquals(ConfProperties.getProperty("emailPlaceholder"),actualPlaceholderEmailInstalment);
    }

    //Задолженность
    //Поле номер аккаунта
    @Test
    public void checkingPlaceHolderNumberAccountArrears() {
        String actualPlaceHolderNumberAccountArrears = paymentBlock.checkPlaceholderNumberAccountArrears();
        Assert.assertEquals(ConfProperties.getProperty("accountNumberArrearsPlaceholder"),actualPlaceHolderNumberAccountArrears);
    }

    //Поле сумма
    @Test
    public void checkingPlaceHolderSumArrears() {
        String actualPlaceholderSumArrears = paymentBlock.checkPlaceholderSumArrears();
        Assert.assertEquals(ConfProperties.getProperty("sumPlaceholder"),actualPlaceholderSumArrears);
    }

    //Поле e-mail
    @Test
    public void checkingPlaceHolderEmailArrears() {
        String actualPlaceholderEmailArrears = paymentBlock.checkPlaceholderEmailArrears();
        Assert.assertEquals(ConfProperties.getProperty("emailPlaceholder"),actualPlaceholderEmailArrears);
    }


    @AfterClass
    public static void tearDown() {
        driver.quit(); }
}


