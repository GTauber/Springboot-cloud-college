package college.spb.cloud.project.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link college.spb.cloud.project.model.entity.Client}
 */
public record ClientDto(Long id, String uuid,
                        @Size(min = 3, max = 15)
                        @NotBlank(message = "Name is required")
                        String name,
                        @Email(message = "Email should be valid")
                        @NotBlank(message = "Email is required")
                        String email,
                        @NotBlank(message = "Phone number is required")
                        String phoneNumber) implements
    Serializable {

}