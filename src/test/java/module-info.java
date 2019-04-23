open module com.example.service
{
    // main
    exports com.example;

    uses com.example.Service;

    // test
    requires org.junit.jupiter.api;

    provides com.example.Service with
        com.example.ServiceImpl;
}
