package by.pvt.utils.convector;

import by.pvt.model.Note;

public class NoteConvectorImpl {

    public Note convectorToNewEntity(Note dto) {
        Note note = new Note();
        note.setText(dto.getText());
        note.setDate(dto.getDate());
        note.setAuthor(dto.getAuthor());

        return note;
    }

    public Note updateConvectorToEntity(Note entity, Note dto) {

        if (dto.getText() != null) {
            entity.setText(dto.getText());
        }
        if (dto.getDate() != null) {
            entity.setDate(dto.getDate());
        }
        if (dto.getAuthor() != null) {
            entity.setAuthor(dto.getAuthor());
        }
        return entity;
    }
}
