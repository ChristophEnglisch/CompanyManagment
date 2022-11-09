package main.java.cenglisch.hiring.domain.candidate.event;

import main.java.cenglisch.hiring.domain.candidate.CandidateId;

public class CandidateAccepted implements CandidateEvent {
    private final CandidateId candidateId;

    public CandidateAccepted(CandidateId candidateId) {
        this.candidateId = candidateId;
    }
}
