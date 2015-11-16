package com.springapp.mvc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: murat
 * Date: 12.05.2013
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/applicationContext-service.xml"})
//public class AbstractTest extends AbstractTransactionalJUnit4SpringContextTests {

    public class AbstractTest extends AbstractJUnit4SpringContextTests {



}