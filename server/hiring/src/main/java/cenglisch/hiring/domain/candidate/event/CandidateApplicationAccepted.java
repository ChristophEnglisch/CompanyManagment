package main.java.cenglisch.hiring.domain.candidate.event;

import main.java.cenglisch.hiring.domain.candidate.CandidateId;

public class CandidateApplicationAccepted implements CandidateEvent {
    private final CandidateId candidateId;

    public CandidateApplicationAccepted(CandidateId candidateId) {
        this.candidateId = candidateId;
    }
}
