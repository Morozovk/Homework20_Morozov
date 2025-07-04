package tests.iosTest;

import com.codeborne.selenide.selector.ByText;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

//public class SearchOnIosTest extends TestBase {
//
//    @BeforeAll
//    static void setup() {
//        System.setProperty("platform", "ios");
//    }
//
//    @Tag("ios_browserstack")
//    @Test
//    void searchAppiumOnIosTest() {
//        step("Verify content found", () -> {
//            $$(id("XCUIElementTypeStaticText"))
//                    .findBy(text("Kelper.gl"))
//                    .click();
//        });
//    }
//}
