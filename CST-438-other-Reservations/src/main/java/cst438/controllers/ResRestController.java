package cst438.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst438.services.PackageService;

@RestController
@RequestMapping("/api")
public class ResRestController
{
   @Autowired
   private PackageService packageService;
}