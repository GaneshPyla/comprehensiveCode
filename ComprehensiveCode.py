from selenium import webdriver
import time
import pytest


@pytest.fixture(scope="session")
def browser():

    driver = webdriver.Chrome()
    yield driver
    driver.quit()


def test_verify_w3schools_logo(browser):

    browser.get("https://www.w3schools.com/")
    time.sleep(2)
    w3schools_logo = browser.find_element_by_xpath('//a[@id="w3-logo"]')

    assert w3schools_logo.is_displayed()


if __name__ == "__main__":
    pytest.main(["-v"])
