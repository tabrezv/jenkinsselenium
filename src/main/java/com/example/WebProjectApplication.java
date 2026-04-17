package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        // Return HTML content with branding and a form
    return "<html>" +
        "<head>" +
        "    <title>CloudFolks HUB</title>" +

        // Bootstrap CDN
        "    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>" +

        "    <style>" +
        "        body { background: linear-gradient(to right, #eef2f3, #dfe9f3); font-family: Arial; }" +
        "        .card { border-radius: 15px; }" +
        "        .btn-custom { background-color: #2c3e50; color: white; }" +
        "        .btn-custom:hover { background-color: #1a252f; }" +
        "    </style>" +

        "</head>" +

        "<body>" +

        // Navbar
        "<nav class='navbar navbar-dark bg-dark'>" +
        "   <div class='container'>" +
        "       <span class='navbar-brand'>CloudFolks HUB</span>" +
        "   </div>" +
        "</nav>" +

        // Main Content
        "<div class='container mt-5'>" +
        "   <div class='row justify-content-center'>" +
        "       <div class='col-md-6'>" +

        "           <div class='card shadow-lg p-4 text-center'>" +

        "               <h2 class='mb-3 text-success'>Welcome to <span style=\"color:#00008B;\">CloudFolks HUB</span></h2>" +
        "               <p class='text-muted'>Empowering Your DevOps Journey</p>" +

        "               <form method='post' action='/submit'>" +

        "                   <div class='mb-3 text-start'>" +
        "                       <label>Name</label>" +
        "                       <input type='text' name='name' class='form-control' placeholder='Enter your name' required>" +
        "                   </div>" +

        "                   <div class='mb-3 text-start'>" +
        "                       <label>Email</label>" +
        "                       <input type='email' name='email' class='form-control' placeholder='Enter your email' required>" +
        "                   </div>" +

        "                   <button type='submit' class='btn btn-custom w-100'>Submit</button>" +

        "               </form>" +

        "           </div>" +

        "       </div>" +
        "   </div>" +
        "</div>" +

        // Footer
        "<footer class='text-center mt-5 p-3 bg-dark text-white'>" +
        "   © 2026 CloudFolks HUB" +
        "</footer>" +

        "</body>" +
        "</html>";    
    
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String name, @RequestParam String email) {
        // This part will never be executed because the form submission is blocked
        return "<html>" +
                "<head><title>Form Submitted</title></head>" +
                "<body style='text-align:center; background-color:#f0f8ff;'>" +
                "    <h1 style='color: #4CAF50;'>Thank You, " + name + "!</h1>" +
                "    <p style='font-size:20px; color: #555;'>Your email (" + email + ") has been submitted successfully.</p>" +
                "</body>" +
                "</html>";
    }
}
