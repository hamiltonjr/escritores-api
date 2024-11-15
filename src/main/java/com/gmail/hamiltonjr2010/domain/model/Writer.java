package com.gmail.hamiltonjr2010.domain.model;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_writer")
public class Writer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Birth birth;

    @OneToOne(cascade = CascadeType.ALL)
    private Death death;

    private List<String> work;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Birth getBirth() { return birth; }
    public void setBirth(Birth birth) { this.birth = birth; }

    public Death getDeath() { return death; }
    public void setDeath(Death death) { this.death = death; }

    public List<String> getWork() { return work; }
    public void setWork(List<String> work) { this.work = work; }

}
