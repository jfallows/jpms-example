open module com.example.service.test
{
    requires com.example.service;
    requires org.junit.jupiter.api;

    provides com.example.Service with
        com.example.test.internal.ServiceImpl;
}
