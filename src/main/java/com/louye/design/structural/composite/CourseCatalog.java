package com.louye.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: louye
 * @Date: 2021/1/8 10:01
 * @Description:
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (Integer i = 0; i < level; i++) {
                    System.out.print("    ");
                }
            }
            catalogComponent.print();
        }
    }
}
