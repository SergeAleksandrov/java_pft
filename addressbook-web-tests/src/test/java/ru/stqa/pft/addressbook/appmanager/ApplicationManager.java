package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  FirefoxDriver wd;

  private SessionHelper sessionHelper;

  private NavigayionHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver-v0.18.0-win64/bin/geckodriver.exe");
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigayionHelper(wd);
    wd.get("http://localhost/addressbook/group.php");
    sessionHelper = new SessionHelper(wd  );
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigayionHelper getNavigayionHelper() {
    return navigationHelper;
  }
}
