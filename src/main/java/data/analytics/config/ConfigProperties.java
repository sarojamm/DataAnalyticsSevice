package data.analytics.config;

public class ConfigProperties {
    public static final int CACHE_PERIOD = 31556926;

    public static final String PROPERTY_NAME_DATABASE_DRIVER = "connection.driver_class";
    public static final String PROPERTY_NAME_DATABASE_URL = "connection.url";
    public static final String PROPERTY_NAME_DATABASE_USERNAME = "connection.username";
    public static final String PROPERTY_NAME_DATABASE_PSWD = "connection.password";

    public static final String PROPERTY_NAME_HIBERNATE_DEFAULT_SCHEMA = "hibernate.default_schema";
    public static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
    public static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    public static final String PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
    public static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    public static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

    public static final String RESOURCE_HANDLER_STYLES = "/app/styles/**";
    public static final String RESOURCE_HANDLER_VIEWS = "/app/views/**";
    public static final String RESOURCE_HANDLER_SCRIPTS = "/app/scripts/**";
    public static final String RESOURCE_HANDLER_MEDIA = "/app/media/**";
    public static final String RESOURCE_HANDLER_IIDS = "/app/iids/**";
    public static final String RESOURCE_HANDLER_COMPONENTS = "/app/components/**";
    public static final String RESOURCE_HANDLER_IPAD_COMPONENTS = "/app/ipad-components/**";

    public static final String RESOURCE_LOCATIONS_STYLES = "/app/styles/";
    public static final String RESOURCE_LOCATIONS_VIEWS = "/app/views/";
    public static final String RESOURCE_LOCATIONS_SCRIPTS = "/app/scripts/";
    public static final String RESOURCE_LOCATIONS_MEDIA = "/app/media/";

    public static final String SECURITY_LOGIN_PAGE = "/login.html";
    public static final String SECURITY_LOGOUT_URL = "/logout_submit";
    public static final String SECURITY_LOGIN_PROCESSING_URL = "/login_submit";
    public static final String SECURITY_LOGIN_SUCCESSFUL_URL = "/";

    public static final String SECURITY_USERS_QUERY = "select ID, PASSWORD, ENABLED from ACCOUNT where ID = ?";
    public static final String SECURITY_AUTHORITIES_QUERY = "select ACCOUNT, ROLE from ACCOUNT_ROLE where ACCOUNT = ?";

    public static final String SERVLET_MAPPING = "/";
    public static final String BASE_PACKAGE_CONTROLLER = "com.ge.combo.controller";
    public static final String BASE_PACKAGE_SERVICE = "com.ge.combo.service";
    public static final String BASE_PACKAGE_REPOSITORY = "com.ge.combo.repository";
    public static final String APPLICATION_PROPERTIES = "classpath:application.properties";

    public static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/views/";
    public static final String VIEW_RESOLVER_SUFFIX = ".html";
}
