package com.c205.pellongpellong.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rankId", updatable = false)
    private Long rankId;

    @OneToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @Column(name = "sumExp", nullable = false)
    private int sumExp;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Builder
    public Rank(Member member, int sumExp, String nickname) {
        this.member = member;
        this.sumExp = sumExp;
        this.nickname = nickname;
    }
}
