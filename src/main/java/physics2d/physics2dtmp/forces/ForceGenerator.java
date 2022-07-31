package physics2d.physics2dtmp.forces;

import physics2d.physics2dtmp.rigidbody.Rigidbody2D;

public interface ForceGenerator {
    void updateForce(Rigidbody2D body, float dt);
}
